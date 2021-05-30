import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DahampasalaComponent } from './dahampasala.component';

describe('DahampasalaComponent', () => {
  let component: DahampasalaComponent;
  let fixture: ComponentFixture<DahampasalaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DahampasalaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DahampasalaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
