import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MultiplemediaComponent } from './multiplemedia.component';

describe('MultiplemediaComponent', () => {
  let component: MultiplemediaComponent;
  let fixture: ComponentFixture<MultiplemediaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MultiplemediaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MultiplemediaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
