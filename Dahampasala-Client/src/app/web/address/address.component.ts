import { Component, OnInit } from '@angular/core';
import { AddressService } from 'src/app/entity/address/address.service';

@Component({
  selector: 'app-address',
  templateUrl: './address.component.html',
  styleUrls: ['./address.component.scss']
})
export class AddressComponent implements OnInit {

  addressList : any =[];

  constructor(public serviceApi: AddressService) { }

  ngOnInit(): void {
    this.getAll();
  }


  getAll() {
      return this.serviceApi.getAll().subscribe((data: {}) => {
      this.addressList = data;
   })
  }



}
