import { devOnlyGuardedExpression } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserdataComponent } from '../Homepage/userdata.component';
import { ServiceFileService } from '../service-file.service';

@Component({
  selector: 'app-personalinfo',
  templateUrl: './personalinfo.component.html',
  styleUrls: ['./personalinfo.component.css']
})
export class PersonalinfoComponent implements OnInit {


  constructor(private service: ServiceFileService, private route: Router) {

  }

  form = new FormGroup({
    ref_id: new FormControl("", Validators.required),
    name: new FormControl("", Validators.required),
    mobile_no: new FormControl("", Validators.required),
    email_id: new FormControl("", Validators.required),
    external_customer_id: new FormControl("", Validators.required),
    date_of_birth: new FormControl("", [Validators.required]),
    employer_name: new FormControl(""),
    kyc_details: new FormControl("", [Validators.required, Validators.pattern("^[P]{1}[A]{1}[N]{1}[:]{1}[A-Z]{5}[0-9]{4}[A-Z]{1}$")]),
    udyam_no: new FormControl(""),
    loyality_card: new FormControl(""),

  })

  data = {

  }
  loginObj = {
    msg: '',
    dedupe: null,
  }

  ngOnInit(): void {

    // this.service.getDedupe().subscribe((r: any) => {
    //   this.data = r;
    // //  console.log(this.data);
    //   // console.log(this.data.Array(0))
    //   // this.form.patchValue({
    //   //   refid:this.data.Array(0)

    //   // })
    // })

    this.form.patchValue({
      ref_id: 'BIZLLAP0000000528',
      name: 'Deepika Kumari',
      mobile_no: '8459637309',
      email_id: 'jaguaer@gmail.com',
      external_customer_id: '0'
    })


  }

  submit() {
    console.log(this.form.value);
    this.onClick();

  }

  get f() {
    return this.form.controls;
  }

  onClick() {
    this.service.postDedupe1(this.form.value).subscribe((s: any) => {
      //  console.log(s);
      this.loginObj = s;
      //  console.log(this.loginObj)
      if (this.loginObj.msg === "Dedupe Check Successfully") {

        alert("Yesss");
        this.route.navigate(['/dedupe'])
      }
      else {

        alert("Noooo");
      //  this.route.navigate(['/dedupe'])
      }

    })
  }




}
