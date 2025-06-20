import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Listclient } from './listclient';

describe('Listclient', () => {
  let component: Listclient;
  let fixture: ComponentFixture<Listclient>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Listclient]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Listclient);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
