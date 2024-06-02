package com.dsa.designpaatern.iteraror;



public class CollectionofNames implements Container{
    private class CollectionofNamesIterate implements Iterator{
        int i;
        @Override
        public boolean hasNext() {
            if (i<name.length){
                return true;
            }
            return false;
        }
        @Override
        public Object next() {
            if(this.hasNext()){
                return name[i++];
            }
            return null;
        }
    }


    public String name[]={"Ashwani Rajput", "Soono Jaiswal","Rishi Kumar","Rahul Mehta","Hemant Mishra"};
    @Override
    public Iterator getIterator() {
          return new CollectionofNamesIterate() ;
    }
}



