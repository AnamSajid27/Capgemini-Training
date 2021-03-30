import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ResturantComponent } from './resturant.component';

describe('ResturantComponent', () => {
  let component: ResturantComponent;
  let fixture: ComponentFixture<ResturantComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ResturantComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ResturantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
