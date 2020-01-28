import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ConvertService {

  constructor() { }
    convertToUpper(str : string) : string{
      return str.toUpperCase();

  
  }
}
