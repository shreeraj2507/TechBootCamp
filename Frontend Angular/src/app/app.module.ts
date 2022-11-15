import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonalinfoComponent } from './Applicants_personalinfo/personalinfo.component';
import { ReactiveFormsModule } from '@angular/forms';
import { UserdataComponent } from './Homepage/userdata.component';
import { LoginComponent } from './login/login.component';
import { HttpClientModule } from '@angular/common/http';
import { NewApplicantsPersonalinfoComponent } from './new-applicants-personalinfo/new-applicants-personalinfo.component';
import { FormsModule } from '@angular/forms';
import { NgToastModule } from 'ng-angular-popup';
import { DedupeComponent } from './dedupe/dedupe.component';

@NgModule({
  declarations: [
    AppComponent,
    PersonalinfoComponent,
    UserdataComponent,
    LoginComponent,
    NewApplicantsPersonalinfoComponent,
    DedupeComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule,
    NgToastModule




  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
