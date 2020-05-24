Interface Print {
   public abstract void print();
}

Interface Scan {
  public abstract void scan();
}

Interface Copy {
  public abstract void copy();
}

Interface Fax {
  public abstract void fax();
}

class SimplePrinter implements Print {
   @Override
   public void print(){
      //Code de l'impression
   }
}
