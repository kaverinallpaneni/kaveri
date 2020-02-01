import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  router: any;

  constructor() { }
  checkLogin(txtusername : HTMLInputElement, txtpassword : HTMLInputElement){
    this.router.navigate(['/mymedia']);
  }
  ngOnInit() {
  }

}
