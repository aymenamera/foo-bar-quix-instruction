import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { FooBarQuixService } from '../foo-bar-quix.service'

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent implements OnInit {


@Output() submitNumberOutput = new EventEmitter<{ numberToConvert: number , result : string}>();
result:any;
input :any ;
 constructor(private fbqService:FooBarQuixService) {

  }

  ngOnInit(): void {
  }

  submitNumber(): void {
    this.fbqService.convertNumber(this.input).subscribe((data)=>{
    this.result = data;
    console.log(this.result);
    this.submitNumberOutput.emit({numberToConvert :this.input, result:this.result.result });
    });
  }

}
