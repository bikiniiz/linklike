package linklike



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(LinkController)
class LinkControllerTests {

    void testCreateLink() {
       params.title = 'facebook'
       params.url = 'www.facebook.com'
	   controller.create()
	   
	   assert Link.count == 1
    }
	
	void testIncreaseVote(){
		def link = new Link(title: 'facebook', url: 'www.facebook.com')
		link.save()
		
		params.url = 'www.facebook.com'
		controller.Vote()
		
		assertEquals 1 , Link.get(1).vote
	}
}
