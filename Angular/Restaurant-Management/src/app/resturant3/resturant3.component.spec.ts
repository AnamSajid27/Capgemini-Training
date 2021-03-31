import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Resturant3Component } from './resturant3.component';

describe('Resturant3Component', () => {
  let component: Resturant3Component;
  let fixture: ComponentFixture<Resturant3Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Resturant3Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Resturant3Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
