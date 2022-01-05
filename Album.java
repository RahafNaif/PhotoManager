package PA1;

public class Album {
	
	String name;
	String condition;
	PhotoManager manager;
	
	
	
	public Album(String name, String condition, PhotoManager manager) {
		this.name = name;
		this.condition = condition;
		this.manager = manager;
		
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getCondition() {
		return condition;
	}
	
	public PhotoManager getManager() {
		return manager;
	}
	
	public LinkedList<Photo> getPhotos(){
		
		String[] conditions = condition.split(" AND ");
		LinkedList<Photo> photos = new LinkedList<Photo>();
		
		if (condition.equals("")) {
			return manager.getAllPhotos();
		}	
		
		for(int i=0;i<conditions.length;i++) {
			if(manager.getPhotos().findKey(conditions[i])) {
				if(i==0)
					photos = manager.getPhotos().retrieve();
				else
					photos = compare(photos,manager.getPhotos().retrieve());
			}else {
				LinkedList<Photo> empty = new LinkedList<Photo>();
				return empty;
			}
		}
		return photos;
	}
	
	private LinkedList<Photo> compare(LinkedList<Photo> l1,LinkedList<Photo> l2){
		LinkedList<Photo> all = l1;
		
		if(!all.empty()) {
			all.findFirst();
			while(!all.afterLast()) {
				l2.findFirst();
				boolean found = false;
				while(!l2.last()) {
					if(all.retrieve().equals(l2.retrieve()))
						found =true;
					l2.findNext();
				}
				if(all.retrieve().equals(l2.retrieve()))
					found =true;
				
				if(!found) {
					all.remove();
					continue;
				}
				all.findNext();
			}
		}
			
		return all;
	}

	public int getNbComps() {
		
		if(condition.equals(""))
			return 0;
		
		LinkedList<BSTNode> nodes = new LinkedList<BSTNode>();
		int nbComps = 0;
		
		String[] conditions = condition.split(" AND ");
		
		for(int i=0;i<conditions.length;i++) {
			nodes = manager.getPhotos().findLeastPath(conditions[i]);
			
			if(manager.getPhotos().findKey(conditions[i].trim())) {
				nbComps++;
			}
			
			if(!nodes.empty()) {
				nodes.findFirst();
				while(!nodes.afterLast()) {
					nbComps++;
					nodes.findNext();
				}
			
			}
		}
		
		return nbComps;
	}
}
//FOR NON PUBLIC METHOD---------------------------------------
//LinkedList<String> tags = manager.getPhotos().keys();
//if(!tags.empty()) {
//	tags.findFirst();
//	while(!tags.afterLast()) {
//		manager.getPhotos().findKey(tags.retrieve());
//		manager.getPhotos().retrieve().findFirst();
//		while(!manager.getPhotos().retrieve().last()) {
//			boolean found = false;
//			
//			if(!photos.empty()) {
//				photos.findFirst();
//				while(!photos.last()) {
//					if(photos.retrieve().equals(manager.getPhotos().retrieve().retrieve()))
//						found = true;
//					photos.findNext();
//				}
//				if(photos.retrieve().equals(manager.getPhotos().retrieve().retrieve()))
//					found = true;
//			}
//			if(!found) {
//				photos.insert(manager.getPhotos().retrieve().retrieve());
//			}
//			manager.getPhotos().retrieve().findNext();
//		}
//		boolean found = false;
//		
//		if(!photos.empty()) {
//			photos.findFirst();
//			while(!photos.last()) {
//				if(photos.retrieve().equals(manager.getPhotos().retrieve().retrieve()))
//					found = true;
//				photos.findNext();
//			}
//			if(photos.retrieve().equals(manager.getPhotos().retrieve().retrieve()))
//				found = true;
//		}
//		if(!found) {
//			photos.insert(manager.getPhotos().retrieve().retrieve());
//		}
//		
//		tags.findNext();
//	}
//}
//return photos;
