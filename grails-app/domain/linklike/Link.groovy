package linklike

class Link {
    String title
    String url
    Integer vote = 0
    
    static constraints = {
    }
	
	def increaseVote{
		vote += 1
	}
}
