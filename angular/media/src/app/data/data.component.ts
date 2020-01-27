import { Component, OnInit } from '@angular/core';
@Component({
  selector: 'data',
  templateUrl: './data.component.html',
  styleUrls: ['./data.component.css']
})
export class DataComponent  {
name:string;
age:number;
email:string;
  constructor() { 
    this.name="first";
    this.age=20;
    this.email="first@gmail.com";
    }

  changeval() {
    this.name="second"
    this.age=18;
    this.email="second@gmail.com";
  }

}
 