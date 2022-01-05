package PA1;

public class PhotoManager {
	
	private BST<LinkedList<Photo>> album;
	private LinkedList<Photo> photos;
	
	public PhotoManager() {
		album = new BST<LinkedList<Photo>>();
		photos = new LinkedList<Photo>();
	}

	public void addPhoto(Photo p) {
		
		if(p.getTags()==null || p.getPath()==null || p.getPath().equals(""))
			return;			
		
		if(!photos.empty()) {
			photos.findFirst();
			while(!photos.last()) {
				if(photos.retrieve().getPath().equals(p.getPath()))
					return;
				photos.findNext();
			}
			if(photos.retrieve().getPath().equals(p.getPath()))
				return;
		}
		
		photos.insert(p);
		if(!p.getTags().empty()) {
			
			p.getTags().findFirst();
			
			while(!p.getTags().afterLast()) {
				
				if(album.findKey(p.getTags().retrieve())) {
					album.retrieve().insert(p);
				}else {
					LinkedList<Photo> newPhotos = new LinkedList<Photo>();
					newPhotos.insert(p);
					album.insert(p.getTags().retrieve(), newPhotos);
				}
				p.getTags().findNext();
			}
			
			
		}
		
//		else {
//			album.findRoot();
//			album.retrieve().insert(p);
//		}
			
		
	}
	// Delete a photo
	public <T> void deletePhoto(String path) {
		
		if (photos.empty())
			return;
		photos.findFirst();
		LinkedList<String> tags = null;
		boolean found = false;
		while(!photos.afterLast()) {
			if(photos.retrieve().getPath().equals(path)) {
				tags = photos.retrieve().getTags();
				photos.remove();
				continue;
			}
			photos.findNext();
		}
		
		if (tags==null)//dosen't found photo
			return;
		
		tags.findFirst();
		while(!tags.afterLast()) {
			if(album.findKey(tags.retrieve())) {
			
				album.retrieve().findFirst();
			
				while(!album.retrieve().afterLast()) {
					
					if(album.retrieve().retrieve().getPath().equals(path)) {
						album.retrieve().remove();
						continue;
					}
	
					album.retrieve().findNext();		
				}
//				//for last
//				if(album.retrieve().retrieve().getPath().equals(path)) 
//					album.retrieve().remove();
			
				
			}
			
			if(album.retrieve().empty())
				album.removeKey(tags.retrieve());
			
			tags.findNext();
		}
		

		
		
	}
	// Return the inverted index of all managed photos
	public BST<LinkedList<Photo>> getPhotos(){
		return album;
	}
	
	LinkedList<Photo> getAllPhotos(){
		return photos;
	}
	
	
}
