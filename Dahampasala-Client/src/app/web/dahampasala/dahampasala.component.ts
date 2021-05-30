import { Component, OnInit } from '@angular/core';
import { from } from 'rxjs';
import { DahampasalaService } from 'src/app/entity/dahampasala/dahampasala.service';
import {Dahampasala} from '../../entity/dahampasala/dahampasalaClass';
import {DahampasalaList} from '../../entity/dahampasala/dahampasalaClass';

@Component({
  selector: 'app-dahampasala',
  templateUrl: './dahampasala.component.html',
  styleUrls: ['./dahampasala.component.scss']
})
export class DahampasalaComponent implements OnInit {

  dahampasalalist :any = [];

  selectedDahampasala: Dahampasala = new Dahampasala;
  
  constructor( public serviceApi: DahampasalaService) {
  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    return this.serviceApi.getAll().subscribe((data: {}) => {
      this.dahampasalalist = data;
    })
  }

  delete(id : string) {
    if (window.confirm('Are you sure, you want to delete?')){
      this.serviceApi.delete(id).subscribe(data => {
        this.getAll()
      })
    }
  }  

  onSelect(dahampasala: Dahampasala) : void{
    this.selectedDahampasala = dahampasala;
  }

}
