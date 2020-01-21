package com.jsmile.junit5;

public class Dollar
{
   int amount;

   public Dollar( int _amount )
   {
      this.amount = _amount;
   }

   public void times( int _multiplier ) { this.amount *= _multiplier; }
}
