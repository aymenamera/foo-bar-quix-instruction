import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { FooBarQuixService } from '../foo-bar-quix.service';
import { FooBarQuixFormComponent } from '../foo-bar-quix-form/foo-bar-quix-form.component';
import { ViewChild } from '@angular/core'
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html'
})
export class FooBarQuixComponent implements OnInit, OnDestroy {

result:any;
inputNumber: number;

private childFormGroup: FormGroup;

 converteds: NumberConverted[] = [ ];

  constructor(private fooBarQuixService: FooBarQuixService) { }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber : NumberConverted): void {
    this.converteds.push({numberToConvert: inputNumber.numberToConvert, result: inputNumber.result});
  }
}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}



