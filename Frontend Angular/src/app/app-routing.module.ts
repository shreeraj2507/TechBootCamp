import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { UserdataComponent } from './Homepage/userdata.component';
import { PersonalinfoComponent } from './Applicants_personalinfo/personalinfo.component';
import { NewApplicantsPersonalinfoComponent } from './new-applicants-personalinfo/new-applicants-personalinfo.component';
import { DedupeComponent } from './dedupe/dedupe.component';

const routes: Routes = [
  {
    path: '', redirectTo: '/login', pathMatch: 'full'
  },
  {
    path: 'login', component: LoginComponent
  },
  {
    path: 'userdata', component: UserdataComponent
  },
  {
    path: 'applicantspersoninfo', component: PersonalinfoComponent
  },
  {
    path:'new_applicants_personalinfo' , component:NewApplicantsPersonalinfoComponent
  },
  {
    path:'dedupe' , component:DedupeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
