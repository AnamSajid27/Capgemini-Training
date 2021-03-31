import { TestBed } from '@angular/core/testing';

import { AdvertisementServiceService } from './advertisement-service.service';

describe('AdvertisementServiceService', () => {
  let service: AdvertisementServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdvertisementServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
