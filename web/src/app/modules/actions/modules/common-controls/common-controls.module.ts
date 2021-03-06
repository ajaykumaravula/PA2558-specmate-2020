import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ConnectionModule } from '../../../common/modules/connection/connection.module';
import { ValidationModule } from '../../../forms/modules/validation/validation.module';
import { SpecmateSharedModule } from '../../../specmate/specmate.shared.module';
import { CommonControls } from './components/common-controls.component';
import { UndoService } from './services/undo.service';

@NgModule({
  imports: [
    // MODULE IMPORTS
    BrowserModule,
    SpecmateSharedModule,
    ConnectionModule,
    ValidationModule
  ],
  declarations: [
    // COMPONENTS IN THIS MODULE
    CommonControls
  ],
  exports: [
    // THE COMPONENTS VISIBLE TO THE OUTSIDE
    CommonControls
  ],
  providers: [
    // SERVICES
    UndoService
  ],
  bootstrap: [
    // COMPONENTS THAT ARE BOOTSTRAPPED HERE
  ]
})

export class CommonControlsModule { }
