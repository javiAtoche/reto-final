import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OffersValidComponent } from './offers-valid.component';

describe('OffersValidComponent', () => {
  let component: OffersValidComponent;
  let fixture: ComponentFixture<OffersValidComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OffersValidComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OffersValidComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
