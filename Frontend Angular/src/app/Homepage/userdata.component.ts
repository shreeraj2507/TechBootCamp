import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ServiceFileService } from '../service-file.service';
import { Router } from '@angular/router';
import { NgToastService } from 'ng-angular-popup';

@Component({
  selector: 'app-userdata',
  templateUrl: './userdata.component.html',
  styleUrls: ['./userdata.component.css']
})
export class UserdataComponent implements OnInit {

  name = "";
  email = "";
  mobileno = 0;
  sub = false;
  a = false;
  b = true;
  eotp = "";
  c = false;
  d = false;
  e = false;


  constructor(private service: ServiceFileService, private route: Router, private toast: NgToastService) { }

  ngOnInit(): void {

  }
  form1 = new FormGroup({
    name: new FormControl("", [Validators.required, Validators.minLength(5)]),
    email: new FormControl("", [Validators.required, Validators.email]),
    mobileno: new FormControl("", [Validators.required, Validators.pattern("(^[6-9]{1})+([0-9]{9})$")])

  });

  get f() {
    return (this.form1.controls);
  }

  submit() {
    console.log(this.form1.value)
  }

  enterotp() {
    this.toast.info({ detail: 'OTP send Successfully', summary: '', duration: 3000 });
    this.b = false;
    this.c = true;
  }

  validateotp() {

    if ((this.eotp) == '1111') {
      this.toast.success({ detail: 'OTP Validate ...', summary: '', duration: 3000 });
      this.d = true;
      this.c = false;
      
        this.a=true;
      
    }
    else {
      this.toast.error({ detail: 'Invalid OTP', summary: '', duration: 3000 });
    }
  }

  loginObj = {
    msg: '',
    user: null,
  }

  onClick(name: String, email: string, mb: string) {
    let obj = {
      name: name,
      email_id: email,
      mobile_no: mb

    }
    console.log(obj)
    this.service.getApplicantLogin(obj)
      .subscribe((r) => {
        // console.log(r)
        this.loginObj = (<any>r)
        //  console.log(r)
        console.log(this.loginObj);
        if (this.loginObj.msg == 'Valid User') {
          this.route.navigate(['/applicantspersoninfo']);
        }
        else {
          this.toast.error({ detail: this.loginObj.msg, summary: 'Enter ', duration: 3000 });
          this.route.navigate(['/new_applicants_personalinfo']);
        }
      })
  }
}