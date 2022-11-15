import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DedupeComponent } from './dedupe.component';

describe('DedupeComponent', () => {
  let component: DedupeComponent;
  let fixture: ComponentFixture<DedupeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DedupeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DedupeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
