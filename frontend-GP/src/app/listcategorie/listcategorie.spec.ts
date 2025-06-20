import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Listcategorie } from './listcategorie';

describe('Listcategorie', () => {
  let component: Listcategorie;
  let fixture: ComponentFixture<Listcategorie>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Listcategorie]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Listcategorie);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
