import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Listprovider } from './listprovider';

describe('Listprovider', () => {
  let component: Listprovider;
  let fixture: ComponentFixture<Listprovider>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Listprovider]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Listprovider);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
