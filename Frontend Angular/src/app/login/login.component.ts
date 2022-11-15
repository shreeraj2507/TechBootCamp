import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ServiceFileService } from '../service-file.service';
import { Router } from '@angular/router';
import { NgToastService } from 'ng-angular-popup';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username: String = "";
  password: String = "";
  errorMessage = 'Invalid Credentials';
  successMessage: String = "";
  invalidLogin = false;
  loginSuccess = false;
  router: any;
  


  constructor(private ser: ServiceFileService, private route: Router, private toast: NgToastService) { }

  ngOnInit(): void {
  }
  form = new FormGroup({
    username: new FormControl("", [Validators.required, Validators.minLength(5)]),
    password: new FormControl("", [Validators.required]),

  });
  get f() {
    return this.form.controls;
  }
  submit() {
    //console.log(this.form.value)
    if (this.username == "Biz_loan" && this.password == "Bizloan@123") {
      this.toast.success({ detail: 'Login Successefull', summary: '', duration: 3000 });
      this.route.navigate(['/userdata']);
    }
    else {
      this.toast.error({ detail: 'Invalid Username or Password !!!', summary: '', duration: 3000 });
    }
    //console.log(this.form.value);
  }
  

}
