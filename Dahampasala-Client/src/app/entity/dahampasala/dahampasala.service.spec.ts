import { TestBed } from '@angular/core/testing';

import { DahampasalaService } from './dahampasala.service';

describe('DahampasalaService', () => {
  let service: DahampasalaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DahampasalaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
