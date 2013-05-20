package linklike



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Link)
class LinkTests {

    void testCreateNewLink() {
    	def link = new Link(title: 'facebook', url: 'www.facebook.com', vote: 0)
		
		assert link != null
    }
	
	void testVote() {
		def link = new Link(title: 'facebook', url: 'www.facebook.com', vote: 0)
		link.vote += 1
		assertEquals 1 , link.vote
		
		link.save()
	}
}
