import { Component, OnInit } from '@angular/core';
import { Media } from '../model.ts/media.model';

@Component({
  selector: 'app-media',
  templateUrl: './media.component.html',
  styleUrls: ['./media.component.css']
})
export class MediaComponent implements OnInit {
   medias: Array<Media>;
  
   constructor() { 
     this.medias=[
       new Media("firstname","media details","time","sunrise"),
       new Media("secondname","media details","time","sunrise"),
       new Media("thirdname","media details","time","sunrise"),
     ];
   }
   saveMedia(txttitle:HTMLInputElement, txtdescription:HTMLInputElement, txttag:HTMLInputElement,txtname:HTMLInputElement):void{
    let media = new Media(txttitle.value, txtdescription.value,txttag.value,txtname.value);
    this.medias.push(media);
    txttitle.value = "";
    txtdescription.value = "";
    txttag.value = "";
    txtname.value = "";

   }
  ngOnInit() {
  }

}
