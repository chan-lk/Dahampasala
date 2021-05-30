import { Component, OnInit, Input} from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { DahampasalaService } from 'src/app/entity/dahampasala/dahampasala.service';
import { Dahampasala } from 'src/app/entity/dahampasala/dahampasalaClass';

@Component({
  selector: 'app-dahampasala-details',
  templateUrl: './dahampasala-details.component.html',
  styleUrls: ['./dahampasala-details.component.scss']
})
export class DahampasalaDetailsComponent implements OnInit {

  id2 = this.actRoute.snapshot.params['id'];
  id :any = this.actRoute.snapshot.paramMap.get('id')
  // employeeData: any = {};
  s! : string;
  constructor( public serviceApi: DahampasalaService,
    public actRoute: ActivatedRoute,
    public router: Router) { }

  @Input()  dahampasala: Dahampasala = new Dahampasala;
  ngOnInit(): void {
  }

   // Update employee data
   update() {
    if(window.confirm('Are you sure, you want to update?' + this.dahampasala.id)){
      this.serviceApi.update(this.dahampasala.id, this.dahampasala).subscribe(data => {
        // this.router.navigate(['/employees-list'])
      })
      this.s ="";
    }
  }


}
