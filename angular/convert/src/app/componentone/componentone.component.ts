import { Component, OnInit } from '@angular/core';
import { ConvertService } from '../service/convert.service';

@Component({
  selector: 'app-componentone',
  templateUrl: './componentone.component.html',
  styleUrls: ['./componentone.component.css']
})
export class ComponentoneComponent implements OnInit {
  ngOnInit(): void {
    throw new Error("Method not implemented.");
  }
uppercase:string;
  constructor(public convertService : ConvertService) {
  } 
    fun(txt : HTMLInputElement)
    {
this.uppercase=this.convertService.convertToUpper(txt.value);
    }
  }