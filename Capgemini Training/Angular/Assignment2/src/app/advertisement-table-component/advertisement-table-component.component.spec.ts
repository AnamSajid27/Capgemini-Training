import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdvertisementTableComponentComponent } from './advertisement-table-component.component';

describe('AdvertisementTableComponentComponent', () => {
  let component: AdvertisementTableComponentComponent;
  let fixture: ComponentFixture<AdvertisementTableComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdvertisementTableComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdvertisementTableComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
