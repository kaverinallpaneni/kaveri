import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MediaphaseComponent } from './mediaphase.component';

describe('MediaphaseComponent', () => {
  let component: MediaphaseComponent;
  let fixture: ComponentFixture<MediaphaseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MediaphaseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MediaphaseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
