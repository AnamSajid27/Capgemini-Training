import { TestBed } from '@angular/core/testing';

import { MenuServiceService } from './menu-service.service';

describe('MenuServiceService', () => {
  let service: MenuServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MenuServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
