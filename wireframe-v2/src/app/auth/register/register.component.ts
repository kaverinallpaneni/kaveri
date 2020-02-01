import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  router: any;


  constructor() { }
  checkRegister(txtUsername : HTMLInputElement, txtPassword : HTMLInputElement,txtRepeatPassword:HTMLInputElement,txtEmail:HTMLInputElement){
    this.router.navigate(['/login'])
  }
  ngOnInit() {
  }

}
