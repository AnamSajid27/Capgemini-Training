import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Resturant2Component } from './resturant2.component';

describe('Resturant2Component', () => {
  let component: Resturant2Component;
  let fixture: ComponentFixture<Resturant2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Resturant2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Resturant2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
