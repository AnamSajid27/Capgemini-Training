import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Resturant1Component } from './resturant1.component';

describe('Resturant1Component', () => {
  let component: Resturant1Component;
  let fixture: ComponentFixture<Resturant1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Resturant1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Resturant1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
