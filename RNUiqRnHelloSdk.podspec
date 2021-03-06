require "json"

package = JSON.parse(File.read(File.join(__dir__, "package.json")))


Pod::Spec.new do |s|
  s.name         = "RNUiqRnHelloSdk"
  s.version      = package["version"]
  s.summary      = package["description"]
  s.description  = <<-DESC
                  RNUiqRnHelloSdk
                   DESC
  s.homepage     = "https://github.com/author/RNUiqRnHelloSdk.git"
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "aravind.gs@useriq.com" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNUiqRnHelloSdk.git", :tag => "master" }
  s.source_files  = "ios/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  s.dependency "UIQHello"

end

  