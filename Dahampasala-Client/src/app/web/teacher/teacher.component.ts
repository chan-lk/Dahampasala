import { Component, OnInit } from '@angular/core';
import { ModalDismissReasons, NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { TeacherService } from 'src/app/entity/teacher/teacher.service';

@Component({
  selector: 'app-teacher',
  templateUrl: './teacher.component.html',
  styleUrls: ['./teacher.component.scss']
})

export class TeacherComponent implements OnInit {

  displayedColumns = ['position', 'name', 'weight', 'symbol'];
  dataSource;

  teacherlist :any = [];

  closeModal!: string;
  modalContent!: string;

  // selectedDahampasala: Dahampasala = new Dahampasala;
  
  constructor( public serviceApi: TeacherService,
    private modalService: NgbModal) {
    this.dataSource = this.teacherlist;

  }

  ngOnInit(): void {
    this.getAll();
  }


  getAll() {
      return this.serviceApi.getAll().subscribe((data: {}) => {
      this.teacherlist = data;
   })
  }


  triggerModal(modalContent: any) {
    this.modalService.open(modalContent, {ariaLabelledBy: 'modal-basic-title'}).result.then((res) => {
      this.closeModal = `Closed with: ${res}`;
    }, (res) => {
      this.closeModal = `Dismissed ${this.getDismissReason(res)}`;
    });
  }
  
  private getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return  `with: ${reason}`;
    }
  }



}
