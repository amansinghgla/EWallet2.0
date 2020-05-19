import { TestBed } from '@angular/core/testing';

import { WalletuserService } from './walletuser.service';

describe('WalletuserService', () => {
  let service: WalletuserService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(WalletuserService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
