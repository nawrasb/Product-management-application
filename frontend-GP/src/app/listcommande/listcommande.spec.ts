import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Listcommande } from './listcommande';

describe('Listcommande', () => {
  let component: Listcommande;
  let fixture: ComponentFixture<Listcommande>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Listcommande]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Listcommande);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
