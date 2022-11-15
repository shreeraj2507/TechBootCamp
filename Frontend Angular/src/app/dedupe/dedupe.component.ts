import { Component, OnInit } from '@angular/core';
import { ServiceFileService } from '../service-file.service';

@Component({
  selector: 'app-dedupe',
  templateUrl: './dedupe.component.html',
  styleUrls: ['./dedupe.component.css']
})
export class DedupeComponent implements OnInit {

  constructor(private service: ServiceFileService) { }
  data: any = {

  }
  ngOnInit(): void {
    this.dedupe();

  }

  dedupe() {
    this.service.getDedupe().subscribe((r: any) => {
      this.data = r;
      console.log(this.data);
    })
  }

}
