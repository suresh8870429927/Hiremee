describe('angularjs homepage todo list', function() {
  it('should add a todo', function() {
    browser.get('http://juliemr.github.io/protractor-demo/');

    element(by.model('first')).sendKeys('10');
    element(by.model('second')).sendKeys('10');
    element(by.id('gobutton')).click();
    element(by.className('ng-binding')).getText();
    
  })
})