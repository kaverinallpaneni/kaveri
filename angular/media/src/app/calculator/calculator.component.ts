import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent{
uvalue1:number;
uvalue2:number;
result:number;
add(uvalue1:HTMLInputElement,uvalue2:HTMLInputElement){
  this.uvalue1=parseInt(uvalue1.value);
  this.uvalue2=parseInt(uvalue2.value);
this.result=(this.uvalue1+this.uvalue2);
  
}
sub(uvalue1:HTMLInputElement,uvalue2:HTMLInputElement){
  this.uvalue1=parseInt(uvalue1.value);
  this.uvalue2=parseInt(uvalue2.value);
  this.uvalue1-this.uvalue2;
}

}

