import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DahampasalaDetailsComponent } from './dahampasala-details.component';

describe('DahampasalaDetailsComponent', () => {
  let component: DahampasalaDetailsComponent;
  let fixture: ComponentFixture<DahampasalaDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DahampasalaDetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DahampasalaDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
