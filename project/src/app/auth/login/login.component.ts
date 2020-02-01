import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from 'src/app/service/authentication.service';
import { ValueConverter } from '@angular/compiler/src/render3/view/template';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  /*styleUrls: ['./login.component.css']*/
})
export class LoginComponent implements OnInit {
  
  autherized: boolean;
  errorMessage: string;


  constructor(public auth:AuthenticationService,public router:Router) {
    this.errorMessage = "Invalid Credentials!!!";
    this.autherized = true;
   }
  checkLogin(txtLogin : HTMLInputElement, txtPass : HTMLInputElement){
   if(this.auth.authenticate(txtLogin.value,txtPass.value))
   {
    this.autherized=true;
    this.router.navigate(['/mymedia']);
  }else{
    this.autherized=false;

  }
}
  ngOnInit() {
  }

}
