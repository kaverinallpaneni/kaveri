import { Component, OnInit, Input } from '@angular/core';
import { Media } from '../model.ts/media.model';

@Component({
  selector: 'app-mediaphase',
  templateUrl: './mediaphase.component.html',
  styleUrls: ['./mediaphase.component.css']
})
export class MediaphaseComponent implements OnInit {
@Input()
mediasList:Array<Media>;
  constructor() { }

  ngOnInit() {
  }

}
