import { Pipe, PipeTransform } from '@angular/core';
import { empty } from 'rxjs';

@Pipe({
  name: 'custompipe'
})
export class CustompipePipe implements PipeTransform {

  transform(value:string):string {
    if(value=="")
    {
    return "no data available";
    }
    else{
    return value;
  }}

}


