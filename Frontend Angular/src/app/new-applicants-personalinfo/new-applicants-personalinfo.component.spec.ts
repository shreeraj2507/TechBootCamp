import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewApplicantsPersonalinfoComponent } from './new-applicants-personalinfo.component';

describe('NewApplicantsPersonalinfoComponent', () => {
  let component: NewApplicantsPersonalinfoComponent;
  let fixture: ComponentFixture<NewApplicantsPersonalinfoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewApplicantsPersonalinfoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NewApplicantsPersonalinfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
