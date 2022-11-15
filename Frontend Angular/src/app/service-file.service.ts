import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { FormGroup, FormControl } from '@angular/forms';


@Injectable({
  providedIn: 'root'
})
export class ServiceFileService {

  url = 'http://localhost:8090/';
  constructor(private http: HttpClient) { }

  //Function for Checking existing user

  getApplicantLogin(obj: any) {
    return (this.http.post(`${this.url}` + `user/login`, obj));
  }

  //Function for geting value of existing user

  getDedupe() {
    return (this.http.get(`${this.url}` + `dedupe`));
  }

  postDedupe1(data: any) {
    return (this.http.post(`${this.url}` + 'dedupe/checkStatus', data));
  }

}





