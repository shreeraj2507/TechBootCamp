import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-new-applicants-personalinfo',
  templateUrl: './new-applicants-personalinfo.component.html',
  styleUrls: ['./new-applicants-personalinfo.component.css']
})
export class NewApplicantsPersonalinfoComponent implements OnInit {

  form = new FormGroup({
    refid: new FormControl("", Validators.required),
    name: new FormControl("", Validators.required),
    mobile: new FormControl("",[Validators.required, Validators.pattern("(^[6-9]{1})+([0-9]{9})$")]),
    email: new FormControl("", Validators.required),
    externalid: new FormControl("", Validators.required),
    dob1: new FormControl("", [Validators.required]),
    empname1: new FormControl(""),
    kycdetails1: new FormControl("", [Validators.required, Validators.pattern("^[P]{1}[A]{1}[N]{1}[:]{1}[A-Z]{5}[0-9]{4}[A-Z]{1}$")]),
    udyamno1: new FormControl(""),
    loyalticard1: new FormControl(""),

  })

constructor(private route:Router){

}

  ngOnInit(): void {

    this.form.patchValue({
      refid: 'BIZLLAP0000000528',
    })
  }

  submit() {
    console.log(this.form.value);
    this.route.navigate(['/userdata']);
  }

  get f() {
    return this.form.controls;
  }
  
}
